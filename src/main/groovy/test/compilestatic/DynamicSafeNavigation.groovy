package test.compilestatic

class DynamicSafeNavigation {
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

    void groovySafeNavigation6() {
        DetailGroovy detailGroovy = null
        detailGroovy?.id = 'new'
    }

    void groovySafeNavigation7() {
        DetailGroovy detailGroovy = null
        detailGroovy?.setId('new')
    }

    String groovySafeNavigation8() {
        DetailGroovy detailGroovy = null
        detailGroovy?.id
    }

    String groovySafeNavigation9() {
        DetailGroovy detailGroovy = null
        detailGroovy?.getId()
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

    void javaSafeNavigation6() {
        DetailJava detailJava = null
        detailJava?.id = 'new'
    }

    void javaSafeNavigation7() {
        DetailJava detailJava = null
        detailJava?.setId('new')
    }

    String javaSafeNavigation8() {
        DetailJava detailJava = null
        detailJava?.id
    }

    String javaSafeNavigation9() {
        DetailJava detailJava = null
        detailJava?.getId()
    }
}
