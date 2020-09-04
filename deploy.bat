REM Checking this in to easily edit and reuse in the future
mvn deploy:deploy-file^
  -Dfile="infusionsoft-api-1.0.3-eri.jar"^
  -Dsources="infusionsoft-api-1.0.3-eri-sources.jar"^
  -DpomFile="infusionsoft-api-1.0.3-eri.pom"^
  -DgroupId="com.infusionsoft"^
  -DartifactId="infusionsoft-api"^
  -Dversion="1.0.3-eri"^
  -DrepositoryId="eri-releases"^
  -Durl="https://elderresearch.jfrog.io/elderresearch/libs-release"