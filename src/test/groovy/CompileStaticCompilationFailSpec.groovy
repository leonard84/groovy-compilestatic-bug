import spock.lang.Specification
import spock.util.EmbeddedSpecCompiler


class CompileStaticCompilationFailSpec extends Specification {
    EmbeddedSpecCompiler compiler = new EmbeddedSpecCompiler()

    def "Assign UUID"() {
        when:
        compiler.compile """
import groovy.transform.CompileStatic
import test.compilestatic.*

@CompileStatic
class TypeSafety {

    void test() {
        new Data().uuid = Helper.createUuid() ?: null

    }
}
"""
        then:
        noExceptionThrown()
    }


    def "Assign Date"() {
        when:
        compiler.compile """
import groovy.transform.CompileStatic
import test.compilestatic.*

@CompileStatic
class TypeSafety {

    void test() {
        new Data().date = Helper.createDate() ?: null

    }
}
"""
        then:
        noExceptionThrown()
    }

    def "Assign String"() {
        when:
        compiler.compile """
import groovy.transform.CompileStatic
import test.compilestatic.*

@CompileStatic
class TypeSafety {

    void test() {
        new Data().id = Helper.createId() ?: null

    }
}
"""
        then:
        noExceptionThrown()
    }

}
