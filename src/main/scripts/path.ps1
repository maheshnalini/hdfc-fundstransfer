
function fundstransfer {
   java -jar $env:userprofile\.m2\repository\hdfc\fundstransfer\${project.version}\fundstransfer-${project.version}-onejar.jar @args
}