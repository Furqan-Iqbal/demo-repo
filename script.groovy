def buildApp(){
  echo 'building app'
}

def testApp(){
  echo 'testing app'
  
}

def deployApp(){
  echo 'dep app'
  echo "deploy version ${params.VERSION}"
  
}
return this
