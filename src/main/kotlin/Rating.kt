import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Rating(id: EntityID<Int>): IntEntity(id) {
    companion object: IntEntityClass<Rating>(Table2)
}