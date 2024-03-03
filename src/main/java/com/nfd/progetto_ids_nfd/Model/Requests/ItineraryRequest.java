package com.nfd.progetto_ids_nfd.Model.Requests;
import com.nfd.progetto_ids_nfd.Model.Contents.Itinerary;
import com.nfd.progetto_ids_nfd.Model.Users.AuthenticatedUser;
import com.nfd.progetto_ids_nfd.Model.Users.GestorUser;
import com.nfd.progetto_ids_nfd.Model.Users.User;
import com.nfd.progetto_ids_nfd.Model.Utils.Enumerables.Role;

/**
 * Represents a request for publishing an itinerary. 
 * This request can be approved or disapproved, 
 * and it can also be forwarded to a Gestor.
 */
public class ItineraryRequest extends Request {
    
    // Property
    private Itinerary itinerary; // The itinerary associated with the request

    /**
     * Constructs a ItineraryRequest object.
     * 
     * @param sender The user sending the itinerary request.
     * @param receiver The role of the user who will receive the request.
     * @param itinerary The itinerary to be published.
     */
    public ItineraryRequest(AuthenticatedUser sender, Role receiver, Itinerary itinerary){
        super(sender, receiver);
        this.itinerary = itinerary;
    }
        
    /**
     * Approves the itinerary request and sets the itinerary visibility to true.
     * 
     * @param validator The user approving the itinerary request.
     */
    @Override
    public void approve(User validator) {
        super.approve(validator);
        itinerary.setVisibility(true);
        // TODO Send itinerary to DataBase for publication
    }

    /**
     * Disapproves the itinerary request and sets the itinerary visibility to false.
     * If the validator is a Gestor, the request and the itinerary will be deleted from the database.
     * 
     * @param validator The user disapproving the itinerary request.
     */
    @Override
    public void disapprove(User validator) {
        super.disapprove(validator);
        itinerary.setVisibility(false);
        if(validator instanceof GestorUser){
            // TODO Delete Request and itinerary from the DataBase
        }
    }

    /**
     * Forwards the request to another user who is a Gestor.
     * 
     * @param validator The user forwarding the request.
     */
    public void forward(){
        receiver = Role.Gestor;
        // TODO Update Request in DataBase
    }
}
