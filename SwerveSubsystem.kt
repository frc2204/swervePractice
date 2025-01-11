object SwerveSubsystem {
    val frontLeft = SwerveModule()
    val frontRight = SwerveModule()
    val backLeft = SwerveModule()
    val backRight = SwerveModule()
    val modules = arrayOf(frontLeft, frontRight, backLeft, backRight)

    fun drive2(chassisSpeeds: ChassisSpeeds){
        chassisSpeeds.toSwerveModuleStates()
        modules.forEachIndexed{index,action->action.drive(chassisSpeeds.toSwerveModuleStates()[index])}
    }
    fun getCurrentSpeed():ChassisSpeeds{
        return ChassisSpeeds(0.0, 0.0)
    }
    init{

    }

}