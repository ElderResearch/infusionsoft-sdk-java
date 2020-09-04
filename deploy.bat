REM Checking this in to easily edit and reuse in the future
mvn deploy:deploy-file^
  -Dfile="infusionsoft-api-eri-1.0.3.jar"^
  -Dsources="infusionsoft-api-eri-1.0.3-sources.jar"^
  -DpomFile="infusionsoft-api-eri-1.0.3.pom"^
  -DgroupId="com.infusionsoft"^
  -DartifactId="infusionsoft-api"^
  -Dversion="eri-1.0.3"^
  -DrepositoryId="eri-releases"^
  -Durl="https://elderresearch.jfrog.io/elderresearch/libs-release"