package com.dnd.vatsaldipen.dnd.recevier;

import android.content.Context;
import java.util.Date;

public class CallReceiver extends PhoneCallReceiver {

    @Override
    protected void onIncomingCallStarted(Context ctx, String number, Date start) {
        super.onIncomingCallStarted(ctx, number, start);
        // TODO send message to the number.
    }

    @Override
    protected void onOutgoingCallStarted(Context ctx, String number, Date start) {
        super.onOutgoingCallStarted(ctx, number, start);
    }

    @Override
    protected void onIncomingCallEnded(Context ctx, String number, Date start, Date end) {
        super.onIncomingCallEnded(ctx, number, start, end);
    }

    @Override
    protected void onOutgoingCallEnded(Context ctx, String number, Date start, Date end) {
        super.onOutgoingCallEnded(ctx, number, start, end);
    }

    @Override
    protected void onMissedCall(Context ctx, String number, Date start) {
        super.onMissedCall(ctx, number, start);
    }

    @Override
    public void onCallStateChanged(Context context, int state, String number) {
        super.onCallStateChanged(context, state, number);
    }
}
