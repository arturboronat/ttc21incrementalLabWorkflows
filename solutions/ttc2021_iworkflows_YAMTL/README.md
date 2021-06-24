# EMFSolutionYAMTL

Solution with incremental execution of the [Incremental Workflows case for the TTC'21 contest](https://www.transformation-tool-contest.eu/schedule.html).

Requires Java 11.

To generate jar file, run `./gradlew clean fatJar` from command line.

## Running the solution with Docker

* cd to root folder of the repository containing the folder `solutions`.
* Build with: `docker build -f solutions/ttc2021_iworkflows_YAMTL/Dockerfile -t ttc2021_iworkflows_yamtl .`
* Run solution with: `docker run ttc2021_iworkflows_yamtl`

