import polyall.quals.*;
import polyall.quals.H1Invalid;

class TypeRefinement {

    @H1Top Object o = new @H1S1 Object();
    //:: error: (polyall.h1invalid.forbidden)
    @H1Top Object o2 = new @H1Invalid Object();
    //:: error: (polyall.h1invalid.forbidden)
    @H1Top Object o3 = getH1Invalid();

    //:: error: (polyall.h1invalid.forbidden)
    @H1Invalid Object getH1Invalid() {
        //:: error: (polyall.h1invalid.forbidden)
        return new @H1Invalid Object();
    }
}
