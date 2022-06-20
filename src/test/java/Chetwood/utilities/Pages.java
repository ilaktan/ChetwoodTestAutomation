package Chetwood.utilities;

import Chetwood.pages.*;

public class Pages {

    GenericFunctions genericFunctions;
    Login login;
    AboutUsPage aboutUsPage;

    GetQuickQuote getQuickQuote;


    public GenericFunctions genericFunctions() {
        if (genericFunctions == null) {
            genericFunctions = new GenericFunctions();
        }
        return genericFunctions;
    }

    public Login login() {
        if (login == null) {
            login = new Login();
        }
        return login;
    }

    public AboutUsPage aboutUsPage() {
        if (aboutUsPage == null) {
            aboutUsPage = new AboutUsPage();
        }
        return aboutUsPage;
    }

    public GetQuickQuote getQuickQuote() {
        if (getQuickQuote == null) {
            getQuickQuote = new GetQuickQuote();
        }
        return getQuickQuote;
    }

}
