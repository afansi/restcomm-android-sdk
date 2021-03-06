/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2017, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 * For questions related to commercial use licensing, please contact sales@telestax.com.
 *
 */

package org.restcomm.android.sdk.fcm;

import org.restcomm.android.sdk.RCClient;

public interface FcmPushRegistrationListener {
    /**
     *   It will be called when registering for push notification is completed.
     *   @param status Error Code - if different than SUCCESS text will be filled with error
     *   @param text Error text
     *   @param isUpdate is this push registration triggered as a resule of
     *                   RCDevice.initialize (false) or RCDevice.reconfigure (true)
    **/
    void onRegisteredForPush(RCClient.ErrorCodes status, String text, boolean isUpdate);

}
