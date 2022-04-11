package com.company.interfaces;

interface member {
    void callback();
}


class customer implements member {
    String name;
    public customer(String name) {
        this.name = name;
    }
    public void callback() {
        System.out.println("Okay, I'll register " + name);
    }
}

class store {
    member[] mem = new member[10];
    int count = 0;

    public void regsiter(member mem) {
        this.mem[count++] = mem;
    }

    public void inviteSale() {
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }


    }
}

class learningInterfaces {
    public static void main(String... args) {
        System.out.println("Hello");
        store st = new store();
        customer c1 = new customer("Arhan");
        customer c2 = new customer("Anand");
        st.regsiter(c1);
        st.regsiter(c2);
        st.inviteSale();
    }
}