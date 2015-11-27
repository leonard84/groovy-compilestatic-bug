package test.compilestatic

import groovy.transform.CompileStatic

@CompileStatic
class SafeNavigation {
    String newId = 'new'
    User user = new User()

    void groovySafeNavigation() {
        println user.detailGroovy?.id?.toString()
    }

    void groovySafeNavigation2() {
        user.detailGroovy?.id = newId
    }

    void groovySafeNavigation3() {
        user.detailGroovy?.setId(newId)
    }

    void groovySafeNavigation4() {
        user.detailGroovy?.id = 'new'
    }

    void groovySafeNavigation5() {
        user.detailGroovy?.setId('new')
    }

    void javaSafeNavigation() {
        println user.detailJava?.id?.toString()
    }

    void javaSafeNavigation2() {
        user.detailJava?.id = newId
    }


    void javaSafeNavigation3() {
        user.detailJava?.setId(newId)
    }

    void javaSafeNavigation4() {
        user.detailJava?.id = 'new'
    }

    void javaSafeNavigation5() {
        user.detailJava?.setId('new')
    }
}
