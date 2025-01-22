public class Phonebook
{
    // Storage of contacts.
    private Person[] contacts;
    // Number of contacts present in the phonebook.
    private int size;

    /**
     * Create a phonebook of size 50.
     */
    public Phonebook()
    {
        contacts = new Person[50];
    }

    /**
     * @return Number of contacts stored in this phonebook.
     */
    public int getSize()
    {
        // Complete this method
        if (size != 0) {
            return size;
        }
        return 0;
    }

    /**
     * Get the contact at index.
     * 
     * @param index Index to get contact.
     * @return Person object from index. Null if index is not valid or out of range.
     */
    public Person getContactAtIndex(int index)
    {
        // Complete this method
        if (index >= 0 && index < contacts.length) {
            Person contactIndex = contacts[index];
            return contactIndex;
        }
        return null;
    }

    /**
     * Get the person object based on a given id.
     * 
     * @param id Target id.
     * @return Person object that has this id. Null if it does not exist.
     */
    public Person getContact(String id)
    {
        // Complete this method
        for (Person contact : contacts) {
            if (contact != null && contact.getId() == id) {
                return contact;
            }
        }
        return null;
    }

    /**
     * Checks if this phonebook has contacts or not.
     * 
     * @return True or False.
     */
    public boolean isEmpty()
    {
        return this.getSize() == 0;
    }

    /**
     * Increase number of contacts present in this phonebook.
     */
    public void incrSize()
    {
        this.size++;
    }

    /**
     * Decrease number of contacts present in this phonebook.
     */
    public void decrSize()
    {
        this.size--;
    }

    /**
     * Increases the size of the phonebook whenever it is full.
     */
    private void increasePhonebookMaxSize()
    {
        // Complete this method
        // Check if the current size has reached the maximum
        if (getSize() == contacts.length) {

            // Double the capacity
            int newCapacity = 50;
            Person [] newContact = new Person[newCapacity];

            // Copy the elements from the old array to the new array
            System.arraycopy(newContact, newCapacity, newContact, newCapacity, newCapacity);

            // Update the reference to the new array
            contacts = newContact;
        }
        // if the size  is not yet at maximum do nothing.
    }

    /**
     * Inserts a new person object at its appropriate lexicographic location in the phonebook.
     * 
     * @param p Person to be addded to the Phonebook.
     */
    public void insert(Person p)
    {
        // Complete this method
        // Check if the phonebook is already full
        if (size == contacts.length) {
            increasePhonebookMaxSize();
        }

        //Find the index to insert the new person
        int index = findIndexInsertion(p);

        //Shift elements to the right to make space for the new person
        for (int i = size; i > index; i--) {
            contacts[i] = contacts[i - 1];
        }
        
        //Insert the new person
        contacts[index] = p;
        incrSize();
    }

    /**
     * Searches in what index should this person object with the given be inserted.
     * 
     * @param p Person object to be inserted into the phonebook.
     * @return Appropriate index (position).
     */
    private int findIndexInsertion(Person p)
    {
        // Complete this method
        for (int i = 0; i < size; i++) {
            if (contacts[i].compareTo(p) > 0) {
                return i;
                //This will return the index where the new person should be inserted
            }
        }
        return size;
        //If all existing contacts are less, insert at the end
    }

    /**
     * Delete a person based on their contact id.
     * 
     * @param id Contact ID of that contact.
     * @return Deleted contact.
     */
    public Person deleteContact(String id)
    {
        // Complete this method...
        return null;
    }

    /**
     * Adjusts the existing contacts in a phonebook from a given starting index to where it ends,
     * following a particular direction.
     * 
     * @param start Index to start adjustment from.
     * @param end Index to end adjustment into.
     * @param direction Direction in which the adjustment must be made. direction = "f" if element
     *        at index 0 takes the value of the element next to it (e.g. index 1). direction = "b"
     *        if element at index 1 takes the value of the element behind it (e.g. index 0).
     */
    private void adjustPhonebook(int start, int end, String direction)
    {
        if (direction.equals("f")) {
            for (int i = start; i < end; i++) {
                contacts[i] = contacts[i + 1];
            }
        } else {
            for (int i = end; i > start; i--) {
                contacts[i] = contacts[i - 1];
            }
        }
    }

    /**
     * Uses ellipsis to ambiguously accept as many country codes as possible. <br>
     * <br>
     * For example: <br>
     * <br>
     * If we have: printContactsFromCountryCodes(1, 2, 3) <br>
     * <br>
     * Then we get: countryCodes = { 1, 2, 3 };
     * 
     * @param countryCodes Area codes to be used as a filter.
     * @return Contacts on this phonebook under a particular area code set by the user.
     */
    public String printContactsFromCountryCodes(int... countryCodes)
    {
        // Complete this method.
        return "";
    }

    /**
     * Print the entire phonebook without any filter or so...
     * 
     * @return The entire list of contacts present in this phonebook.
     */
    public String toString()
    {
        // Complete this method.
        return "";
    }
}
