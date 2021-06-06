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


/**
* To track dependencies in output objects only.
* 
* Uncomment as required by the use case.
* 
*/
//@After("cflowbelow(controlFlowReduceScope()) && syntacticScope() && target(org.eclipse.emf.ecore.EObject) && execution(* *..set* (..))")
//public void featureSetCallInReduce(JoinPoint thisJoinPoint) {
//if (
//(module.executionMode == ExecutionMode.INCREMENTAL)
//|| 
//(module.executionMode == ExecutionMode.PROPAGATION)
//) {
//if (module.incrementalGranularity == IncrementalGranularity.TRAFO_STEP) {
//module.featureSetCallInReduce(thisJoinPoint);
//}
//}
//}
//	
//@After("within(java.util.*) && (cflowbelow(controlFlowReduceScope()) ) && syntacticScope() && target(java.util.Collection) "
//+ "&& ("
//+ "call(* java.util.Collection.add(..)) || "
//+ "call(* java.util.Collection.addAll(..)) ||"
//+ "call(* java.util.Collection.remove(..)) ||"
//+ "call(* java.util.Collection.removeAll(..)) ||"
//+ "call(* java.util.Collection.clear(..)) ||"
//+ "call(* java.util.Collection.retainAll(..))"
//+ ")") 
//public void collectionModification(JoinPoint thisJoinPoint) {
//if (module != null) {
//module.collectionModification(thisJoinPoint);
//}
//}

//	@Pointcut("within(yamtl.core.YAMTLModule) && execution(* propagateDelta(..))")
//	private void controlFlowPropagateDeltaScope() {}		
//	@After("cflowbelow(controlFlowPropagateDeltaScope()) && target(org.eclipse.emf.ecore.change.impl.FeatureChangeImpl) && execution(* *..process(org.eclipse.emf.ecore.EObject,boolean,boolean))") // get(* *)
//	public void testSetInFeatureChangeImpl(JoinPoint thisJoinPoint) {
//		module.changeAnalysis(thisJoinPoint);
//	}
}