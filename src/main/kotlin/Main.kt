import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction


// https://www.baeldung.com/kotlin/exposed-persistence
class Main

open class Your {
    val n = 4
}

class My{
    companion object: Your()
}


fun main(){
    Database.connect("jdbc:h2:mem:test", driver = "org.h2.Driver", user = "root", password = "")
    println(My.n)

    transaction {
        createTables()
        val e1 = User.new{
            name = "koń"
        }
        Table1.selectAll().forEach {
            println(it)
        }

        e1.name = "żyrafa"
        User.all().forEach {
            println(it.name)
        }

        e1.delete()
        Table1.selectAll().forEach {
            println(it)
        }
//        fillTables()
    }
}

fun fillTables() {
    var insterted = Table1.insert {
        it[name] = "name1"
    }
    println(insterted[Table1.id])
    println(insterted[Table1.name])

    insterted = Table1.insert {
        it[name] = "name2"
    }
    println(insterted[Table1.id])
    println(insterted[Table1.name])

    insterted = Table1.insert {
        it[name] = "name3"
    }
    println(insterted[Table1.id])
    println(insterted[Table1.name])

    Table1.update( {Table1.id eq 2} ) {
        it[name] = "name22"
    }
}

fun createTables() {
    SchemaUtils.create(Table1, Table2)
}

