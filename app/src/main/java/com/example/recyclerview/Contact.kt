package com.example.recyclerview

class Contact(val name: String, val isOnline: Boolean) {
    // Static
    companion object{
        // Declare ArrayList
        private val contacts = ArrayList<Contact>()
        // Initialize ArrayList data
        fun getContactsList(numberOfContacts: Int): ArrayList<Contact>{
            for (i in 1..numberOfContacts) {
                val contact = Contact("Person$i", i%3 != 0 && i%4 != 0)
                contacts.add(contact)
            }
            return contacts
        }
    }
}
