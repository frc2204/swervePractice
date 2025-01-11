class Drivearmlift():Command {
    var isDriveFinished:Boolean = false
    override var isFinished: Boolean = false
    override fun initialize(){
        Controller
        SwerveSubsystem
        ArmSubsystem
        ElevatorSubsystem
    }
    override fun periodic() {
        var desiredPlace = Controller.getTranslation2D()
        SwerveSubsystem.drive2(desiredPlace.toChassissSpeeds())
        if (SwerveSubsystem.getCurrentSpeed() == desiredPlace.toChassissSpeeds()) {
            isDriveFinished = true
        }
            var DesiredPosition = Controller.getDesiredArmPosition()
            var DesiredElevatorPosition = Controller.getDesiredElevatorPosition()
            ArmSubsystem.setTargetPosition(DesiredPosition)
            ElevatorSubsystem.getDesiredPosition(DesiredElevatorPosition)
            if (ArmSubsystem.getCurrentPosition() == DesiredPosition &&
                ElevatorSubsystem.getCurrentPosition() == DesiredElevatorPosition &&
                isDriveFinished) {
                isFinished = true
            }
        }
    override fun finished(){
        println("it is finished")
    }

}
