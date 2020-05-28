package com.example.recyclerview

class Contact(val name: String, val isOnline: Boolean) {
    companion object{
        private val contacts = ArrayList<Contact>()
        fun getContactsList(numberOfContacts: Int): ArrayList<Contact>{
            for (i in 1..numberOfContacts) {
                val contact = Contact("Person$i", i/2 == 0)
                contacts.add(contact)
            }
            return contacts
        }
    }
}