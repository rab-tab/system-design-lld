package libManagement.actors;

import libManagement.Search;
import libManagement.account.Account;
import libManagement.book.BookItem;

import java.lang.reflect.Member;

public class Librarian extends Account {
    Search searchObj;
    public boolean addBookItem(BookItem bookItem) {
        return false;
    }

    public boolean blockMember(Member member) {
        return false;
    }

    public boolean unBlockMember(Member member) {
        return false;
    }
}
