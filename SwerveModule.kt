class SwerveModule {
    val steerMotor = Motor()
    val driveMotor= Motor()

    fun drive(state: SwerveModuleState) {
        var driveVoltage = state.getSpeed()
        driveMotor.setControl(driveVoltage)
        var steerVoltage = state.getRotation()
        steerMotor.setControl(steerVoltage.getDeg())

    }


}