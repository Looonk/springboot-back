package com.testing.connector;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.cfg.NotYetImplementedException;

import controllers.ReceiverApplication;
import entity.ClinicalDocument;
import entity.HL7Error;
import entity.MedicalPerson;
import entity.Order;
import entity.OrderResult;
import entity.Patient;
import entity.Procedure;
import enums.ActionCode;

import org.jboss.seam.contexts.Contexts;
import org.jboss.seam.contexts.Lifecycle;
import org.jboss.seam.core.Events;

public class ReceiverApp_Imp extends ReceiverApplication {

    private List<HL7Error> dispatch(String event, Object[] param) {
        List<HL7Error> result = new ArrayList<HL7Error>();
        try {
            if (!Contexts.isApplicationContextActive() && !Contexts.isEventContextActive()
                    && !Contexts.isSessionContextActive())
                Lifecycle.beginCall();
            // System.out.println("Raise Event: " + event);
            Events.instance().raiseEvent(event, new Object[] { param });
        } catch (Exception e) {
            // e.printStackTrace();
            if (e.getCause().getMessage().contains(HL7Error.getRootSeparator())
                    || e.getCause().getMessage().contains(HL7Error.getChildSeparator()))
                result = HL7Error.parse(e.getCause().getMessage());
            else
                result.add(HL7Error.buildGeneric(null, e.getCause().getMessage(), false));
        }
        return result;
    }

    @Override
    public List<HL7Error> launchApprovedAPProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchApprovedConsultProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchApprovedEmergencyProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    };

    @Override
    public List<HL7Error> launchApprovedIMGRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchApprovedInterConsultProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchApprovedLabRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchApprovedMedicalProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchApprovedQXProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchApprovedReferenceProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelProgrammedIMGRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledAPProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledConsultProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledEmergencyProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledIMGRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledInterConsultProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledLabRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledMedicalProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledQXProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchCancelledReferenceProcedure(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchClinicalDocumentNotification(ClinicalDocument arg0, List<String> arg1) {
        Object[] params = new Object[2];
        params[0] = arg0;
        params[1] = arg1;
        return this.dispatch("procedimientoAPAprobarEvent", params);
    }

    @Override
    public List<HL7Error> launchCompletedIMGRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchDeleteIMGProcedures(List<Procedure> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchDeniedIMGRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchMedicalPerson(MedicalPerson arg0, ActionCode arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchModifiedPatient(Patient arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchNewIMGRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchNewMedicalProtocolRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchNewPatient(Patient arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchProcessIMGProcedures(List<Procedure> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchProcessMedicalProgram(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchProcessedIMGRequest(List<Order> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

    @Override
    public List<HL7Error> launchResultIMGProcedures(List<OrderResult> arg0, List<String> arg1) {
        throw new NotYetImplementedException();
    }

}
