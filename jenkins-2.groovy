properties([
  parameters([
    string(
      name: 'TEKST',
      defaultValue: "defaultValue"
      ),
    choice(
      name: 'select:',
      choices: ['1', '2', '3']
      defaultValue: "1"
      )
  ])
])


pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "$TEKST"
            }
        }
        stage('Test') { 
            steps {
                echo "$TEKST"
            }
        }
        stage('Deploy') { 
            steps {
                 echo "$TEKST"
            }
        }
    }
}
