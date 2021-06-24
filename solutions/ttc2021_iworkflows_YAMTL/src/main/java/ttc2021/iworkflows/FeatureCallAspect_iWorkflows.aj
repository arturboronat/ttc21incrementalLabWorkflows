package ttc2021.iworkflows;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import yamtl.core.YAMTLModule;

@Aspect
public class FeatureCallAspect_iWorkflows {
	YAMTLModule module;

	// TO BE UPDATED
	@Pointcut("within(laboratoryAutomation.impl.*)")
	// END TO BE UPDATED 
	private void syntacticScope() {}
	

	//////////////////////////////////////////////////////////////
	// DO NOT MODIFY BELOW
	// //////////////////////////////////////////////////////////////
	@Before("within(yamtl.core.YAMTLModule) && execution(void executeMain())")
	public void getModule(JoinPoint thisJoinPoint) {
		module = (YAMTLModule) thisJoinPoint.getThis(); 
	}
	
	@Pointcut("within(yamtl.scheduler.YAMTLScheduler) && execution(* findMatchesAndSchedule(..))")
	private void controlFlowMatchingScope() {}
	
	@Pointcut("within(yamtl.scheduler.YAMTLScheduler) && execution(* insertTupleMatch(..))")
	private void controlFlowInsertTrafostepScope() {}
	
	@Pointcut("within(yamtl.scheduler.YAMTLScheduler) && execution(* evaluateCallable(..))")
	private void controlFlowEvaluateCallableScope() {}
	
	
	@Pointcut("within(yamtl.core.YAMTLModule) && execution(* reduce(..))")
	private void controlFlowReduceScope() {}
	
	@Pointcut("within(yamtl.core.YAMTLModule) && execution(* applyOutputElementAction(..))")
	private void controlFlowOutputActionScope() {}
	
	@Pointcut("within(yamtl.core.YAMTLModule) && execution(int toIndex(org.eclipse.emf.ecore.EObject))")
	private void controlFlowIndexScope() {}
	
	/* 
	 * MATCHING 
	 */
	@After("cflowbelow(controlFlowMatchingScope()) && !cflowbelow(controlFlowIndexScope()) && !cflowbelow(controlFlowEvaluateCallableScope()) && !cflowbelow(controlFlowInsertTrafostepScope()) && syntacticScope() && target(org.eclipse.emf.ecore.EObject) && execution(* *..get* (..))") // get(* *)
	public void featureGetCallInMatchingCommon(JoinPoint thisJoinPoint) {
		module.featureGetCall_matching_common(thisJoinPoint);
	}
	
	@After("cflowbelow(controlFlowEvaluateCallableScope()) && !cflowbelow(controlFlowIndexScope()) && syntacticScope() && target(org.eclipse.emf.ecore.EObject) && execution(* *..get* (..))") // get(* *)
	public void featureGetCallInMatchingVariants(JoinPoint thisJoinPoint) {
		module.featureGetCall_matching_variants(thisJoinPoint);
	}	
	
	/* 
	 * REDUCE 
	 */
	@After("(cflowbelow(controlFlowReduceScope() && !cflowbelow(controlFlowIndexScope()) && !cflowbelow(controlFlowOutputActionScope()) && !cflowbelow(controlFlowEvaluateCallableScope()))) && syntacticScope() && target(org.eclipse.emf.ecore.EObject) && execution(* *..get* (..))") 
	public void featureGetCallInReduce(JoinPoint thisJoinPoint) {
		module.featureGetCall_reduce_common(thisJoinPoint);
	}
	
	@After("cflowbelow(controlFlowReduceScope()) && !cflowbelow(controlFlowIndexScope()) && (cflowbelow(controlFlowOutputActionScope()) || cflowbelow(controlFlowEvaluateCallableScope())) && syntacticScope() && target(org.eclipse.emf.ecore.EObject) && execution(* *..get* (..))") 
	public void featureGetCallInContextualElement(JoinPoint thisJoinPoint) {
		module.featureGetCall_reduce_variants(thisJoinPoint);
	}

}