/**************************************************************************
 Copyright 2020 Vietnamese-German-University 
 Copyright 2023 ETH Zurich
 
 Licensed under the Apache License, Version 2.0 (the "License"); you may not
 use this file except in compliance with the License. You may obtain a copy of
 the License at
 
 http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 License for the specific language governing permissions and limitations under
 the License.
 
 @author: hoangnguyen (hoang.nguyen@inf.ethz.ch)
 ***************************************************************************/

package modeling.sql.fol.sql2msfol.select;

public enum SelectPattern {
	ONLY_SELECT,
	SELECT_FROM,
	SELECT_FROM_WHERE,
	SELECT_FROM_JOIN,
	SELECT_FROM_JOIN_ON,
	SELECT_FROM_JOIN_ON_WHERE,
	SELECT_FROM_JOIN_WHERE
}
