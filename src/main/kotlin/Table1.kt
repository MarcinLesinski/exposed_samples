import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Table

object Table1: IntIdTable() {
//    val id = integer("id").autoIncrement()
    val name = varchar("name", 50)
//    override val primaryKey = PrimaryKey(id, name = "PK_Table1_Id")
}