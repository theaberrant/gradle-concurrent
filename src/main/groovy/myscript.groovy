/**
 * Created with IntelliJ IDEA.
 * User: Tris
 * Date: 10/10/13
 */
Integer sleepTime = (args[0] as Integer ?: 500)

println "$threadName sleeping for ${sleepTime}ms"
sleep(sleepTime)
println "I have awoken with thread $threadName!"