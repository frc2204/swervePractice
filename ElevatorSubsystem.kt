object ElevatorSubsystem {
    val topMotor = Motor()
    val bottomMotor = Motor()
    var ChosenElevatorPosition:Elevator.Height? = null
    fun getDesiredPosition(DesiredPosition:Elevator.Height){
        ChosenElevatorPosition = DesiredPosition
        val topMotorVoltage = DesiredPosition.topMotorHeight
        topMotor.setControl(topMotorVoltage)
        val bottomMotorVoltage = DesiredPosition.bottomMotorHeight
        bottomMotor.setControl(bottomMotorVoltage)
    }
    fun getCurrentPosition():Elevator.Height?{
        return ChosenElevatorPosition
    }
}