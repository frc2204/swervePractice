import com.sun.tools.javac.Main

class Robot {
    val commandArray = mutableListOf<Command>()
    fun addCommands(){

    }
    fun run(){
        for (command in commandArray) {
            command.initialize()
            command.periodic()
            if(command.isFinished){
                command.finished()
            }
        }
    }
}