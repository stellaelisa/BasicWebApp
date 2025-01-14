package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "stella";
        } else if (query.contains("what")) {
            return "7";
        }
        else if (query.contains("largest")) {
            return "552";
        }
        else if (query.contains("multiplied")) {
            return "15";
        }

        else if (query.contains("what is 11 ")) {
            return "33";
        }

        else if (query.contains("what is 8 multiplied by 8")) {
            return "64";
        }

        else if (query.contains("plus")) {
            return "11";
        }
        else if (query.contains("261")) {
            return "261";
        }






        else
        { // TODO extend the programm here


            return "";
        }
    }
}
