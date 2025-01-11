class SwerveSubsystem {
    val frontLeft = SwerveModule()
    val frontRight = SwerveModule()
    val backLeft = SwerveModule()
    val backRight = SwerveModule()
    val modules = arrayOf(frontLeft, frontRight, backLeft, backRight)
    val chassisSpeeds = ChassisSpeeds()
    fun drive2(){
        chassisSpeeds.toSwerveModuleStates()
        modules.forEachIndexed{index,action->action.drive(chassisSpeeds.toSwerveModuleStates()[index])}
    }
    init{

    }

}