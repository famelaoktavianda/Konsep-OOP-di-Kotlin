package id.ac.polbeng.famelaoktavianda.test_kelas

import java.text.NumberFormat
import java.util.*

open class EmployeeD {
    // Use "open" modifier to allow child classes to override this property
    open val baseSalary: Int = 3000000
}

class Programmer : EmployeeD() {
    // Use "override" modifier to override the property of base class
    override val baseSalary: Int = 5000000
}

class SoftwareEngineer : EmployeeD() {
    // Use "override" modifier to override the property of base class
    override val baseSalary: Int = 6000000
}
class ProjectManager : EmployeeD(){
    // Use "override" modifier to override the property of base class
    override val baseSalary: Int = 8000000
}

fun toRupiahFormat(baseSalary: Int) : String{
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)
    return numberFormat.format(baseSalary).toString()
}
