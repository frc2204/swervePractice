import com.sun.tools.javac.Main

object Robot {
    val commandArray = mutableListOf<Command>()
    fun addCommands(){
//        commandArray.add(DriveCommand())
//        commandArray.add(HomeCommand())
        commandArray.add(Drivearmlift())

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