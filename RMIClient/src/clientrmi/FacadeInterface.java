/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FacadeInterface extends Remote {
    
    
   public void SetBookingData(int booking_ID, String booking_date, String booking_status);
   public String getBookingData();
   public BookingDTO getBooking() throws RemoteException;
    
}
