package ex3_6;

/**
 * Title: Exercise 3.6 Class GroupRecord
 * Description: An instance of GroupRecord represents a list
 * of members who belong to a conservation group
 *
 * Copyright:    Copyright (c) 2003, 2006, 2010
 * Company:      The Open University
 * @author M257 Course Team
 * @version 1.2 July 2010
 * @since Ex3_5
 * Extra methods:
 * 1. getHeadCount returns the number of members in the group
 * 2. getMemberAt(int index)has been added so
 * we can access individual member items in the list by index.
 */
class GroupRecord
{

    private final int DEFAULT_SIZE = 100;
    private Member[] listOfMembers;
    private int headCount = 0;

    public GroupRecord()
    {
        listOfMembers = new Member[DEFAULT_SIZE];
    }

    public void addMember(Member mem)
    {
        listOfMembers[headCount] = mem;
        headCount++;
    }

    public String getEmailAddressForMember(String membersName)
    {
        int index = findIndex(membersName);
        return listOfMembers[index].getEmailAddress();
    }

    public String getHomeAddressForMember(String membersName)
    {
        int index = findIndex(membersName);
        return listOfMembers[index].getHomeAddress();
    }

    private int findIndex(String membersName)
    {
        int i = 0;
        Member mem;

        while (i < headCount)
        {
            mem = listOfMembers[i];
            if (mem.getName().equals(membersName))
            {
                return i;
            }
            i++;
        }
        return -1;   // We assume that this will not be reached.
    }

    public Member getMemberAt(int index)
    {
        return listOfMembers[index];
    }

    public int getHeadCount()
    {
        return headCount;
    }
}
