import org.jetbrains.exposed.dao.Entity
import org.jetbrains.exposed.dao.EntityClass
import org.jetbrains.exposed.dao.id.EntityID

class User(id: EntityID<Int>): Entity<Int>(id) {
    companion object : EntityClass<Int, User>(Table1)
    var name by Table1.name
}