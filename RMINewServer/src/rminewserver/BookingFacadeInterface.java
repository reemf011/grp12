/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rminewserver;

import java.rmi.RemoteException;

/**
 *
 * @author reemf011
 */
public interface BookingFacadeInterface {
   public void SetBookingData(int booking_ID, String booking_date, String booking_status)throws RemoteException;
   public String getBookingData()throws RemoteException;
   public BookingDTO getBooking() throws RemoteException;

    public boolean AddnewBooking(int booking_Id, String Booking_Type, String booking_date, String booking_Status, String booking_time);

    public String ViewBooking(int booking_Id);

}
