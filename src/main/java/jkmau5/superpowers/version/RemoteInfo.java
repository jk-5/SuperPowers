/*
 * Copyright 2013 jk-5 and Lordmau5
 *
 * jk-5 and Lordmau5 License this file to you under the LGPL v3 License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 * http://www.gnu.org/licenses/lgpl.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License
 */

package jkmau5.superpowers.version;

import java.util.List;

public class RemoteInfo {

    public List<Version> versions;

    public Version getFromChannel(VersionChannel channel){
        for(Version version : versions){
            if(version.channel == channel){
                return version;
            }
        }
        return null;
    }
}
