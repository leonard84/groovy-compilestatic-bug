import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Unroll
import test.compilestatic.DynamicSafeNavigation
import test.compilestatic.SafeNavigation


class CompileStaticFailSpec extends Specification {

    @Subject
    SafeNavigation safeNavigation = new SafeNavigation()

    @Unroll('should work for #method')
    def "should work safeNavigation"(String method) {
        when:
        safeNavigation."$method"()

        then:
        noExceptionThrown()

        where:
        method << SafeNavigation.class.methods.findAll { it.name.contains('SafeNavigation') }.name.sort()
    }


    @Unroll('should work for dynamic #method')
    def "should work dynamic safeNavigation"(String method) {
        when:
        new DynamicSafeNavigation()."$method"()

        then:
        noExceptionThrown()

        where:
        method << SafeNavigation.class.methods.findAll { it.name.contains('SafeNavigation') }.name.sort()
    }
}
