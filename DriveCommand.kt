class DriveCommand():Command {
    override var isFinished: Boolean = false

    override fun initialize(){
        SwerveSubsystem
        Controller
    }
    override fun periodic(){
        var desiredPlace = Controller.getTranslation2D()
        SwerveSubsystem.drive2(desiredPlace.toChassissSpeeds())
        if(SwerveSubsystem.getCurrentSpeed() == desiredPlace.toChassissSpeeds()){
            isFinished = true
        }
    }
    override fun finished(){
        println("finished driving!!!! ")
    }
}