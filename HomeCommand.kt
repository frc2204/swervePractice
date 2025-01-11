class HomeCommand():Command {
    override var isFinished: Boolean = false

    override fun finished(){
        println("arm homed evelator homed")
    }
    override fun initialize(){
        Controller
        ArmSubsystem
        Elevator
    }
    override fun periodic(){
        var DesiredPosition = Controller.getDesiredArmPosition()
        var DesiredElevatorPosition = Controller.getDesiredElevatorPosition()
        ArmSubsystem.setTargetPosition(DesiredPosition)
        ElevatorSubsystem.getDesiredPosition(DesiredElevatorPosition)
        if(ArmSubsystem.getCurrentPosition() == DesiredPosition && ElevatorSubsystem.getCurrentPosition() == DesiredElevatorPosition){
            isFinished = true
        }
    }

}