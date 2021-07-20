package org.fasttrackit.course9._03container;

import org.fasttrackit.course9._00model.Human;
import org.fasttrackit.course9._00model.Mechanic;
import org.fasttrackit.course9._00model.Pilot;
import org.fasttrackit.course9._00model.Plumber;

public class Runner {

    public static void main(String[] args) {
        String string1 = "Mary had a little lamb";
        Human h1 = new Mechanic();
        Human h2 = new Pilot();
        Pilot p1 = new Pilot();

//        HumanWrapper w0 = new HumanWrapper(string1);
        HumanWrapper w1 = new HumanWrapper(h1);
        HumanWrapper<Human> w2 = new HumanWrapper(h2);
//        HumanWrapper<Pilot> w3 = new HumanWrapper<Pilot>(h2); // won't work
        HumanWrapper<Pilot> w3 = new HumanWrapper(h2); //shouldn't work
//        w3.setValue(h2); // won't work, correct!
        final Pilot valueW3 = w3.getValue(); // throws ClassCastException
        System.out.println(valueW3);

//        HumanWrapper<Mechanic> w4 = new HumanWrapper<Mechanic>(p1); //won't work
        HumanWrapper<Mechanic> w4 = new HumanWrapper(p1); // shouldn't work
//        w4.setValue(p1); // won't work, correct!
        final Mechanic valueW4 = w4.getValue(); // throws ClassCastException
        System.out.println(valueW4);
    }


    public static void mainForContainers(String[] args) {
        Human h1 = new Mechanic();
        Mechanic m1 = new Mechanic();
        Pilot p1 = new Pilot();
        Plumber p2 = new Plumber();

        Container container = new Container("asd");
//        String containedValue = container.getValue(); // won't work, no type safety

        Container<String> c2 = new Container("das");
        String c2Value = c2.getValue(); // we have type safety!

        Container<Human> humanContainer = new Container<>(m1);
        Human humanValue = humanContainer.getValue();

        Container<Plumber> plumberContainer = new Container<>(p2);
        plumberContainer.printValue();
        Human containedPlumber = plumberContainer.getValue();
    }
}
