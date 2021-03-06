package com.simplemobiletools.contacts.interfaces

import com.simplemobiletools.contacts.activities.MainActivity
import com.simplemobiletools.contacts.models.Contact

interface FragmentInterface {
    fun setupFragment(activity: MainActivity)

    fun textColorChanged(color: Int)

    fun primaryColorChanged(color: Int)

    fun refreshContacts(contacts: ArrayList<Contact>)
}
