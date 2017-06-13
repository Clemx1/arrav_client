/*
	* Copyright (C) 2002-2017 Sebastiano Vigna
	*
	* Licensed under the Apache License, Version 2.0 (the "License");
	* you may not use this file except in compliance with the License.
	* You may obtain a copy of the License at
	*
	*     http://www.apache.org/licenses/LICENSE-2.0
	*
	* Unless required by applicable law or agreed to in writing, software
	* distributed under the License is distributed on an "AS IS" BASIS,
	* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	* See the License for the specific language governing permissions and
	* limitations under the License.
	*/
package it.unimi.dsi.fastutil.objects;
import java.util.ListIterator;
/** A type-specific bidirectional iterator that is also a {@link ListIterator}.
	*
	* <P>This interface merges the methods provided by a {@link ListIterator} and
	* a type-specific {@link it.unimi.dsi.fastutil.BidirectionalIterator}. Moreover, it provides
	* type-specific versions of {@link ListIterator#add(Object) add()}
	* and {@link ListIterator#set(Object) set()}.
	*
	* @see java.util.ListIterator
	* @see it.unimi.dsi.fastutil.BidirectionalIterator
	*/
public interface ObjectListIterator <K> extends ListIterator<K>, ObjectBidirectionalIterator <K> {
}
