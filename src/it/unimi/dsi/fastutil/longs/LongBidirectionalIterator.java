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
package it.unimi.dsi.fastutil.longs;
import it.unimi.dsi.fastutil.BidirectionalIterator;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
/** A type-specific bidirectional iterator; provides an additional method to avoid (un)boxing,
	* and the possibility to skip elements backwards.
	*
	* @see BidirectionalIterator
	*/
public interface LongBidirectionalIterator extends LongIterator , ObjectBidirectionalIterator<Long> {
	/**
	 * Returns the previous element as a primitive type.
	 *
	 * @return the previous element in the iteration.
	 * @see java.util.ListIterator#previous()
	 */
	long previousLong();
	/** {@inheritDoc}
	 * @deprecated Please use the corresponding type-specific method instead. */
	@Deprecated
	@Override
	Long previous();
	/** Moves back for the given number of elements.
	 *
	 * <P>The effect of this call is exactly the same as that of
	 * calling {@link #previous()} for {@code n} times (possibly stopping
	 * if {@link #hasPrevious()} becomes false).
	 *
	 * @param n the number of elements to skip back.
	 * @return the number of elements actually skipped.
	 * @see #previous()
	 */
	int back(int n);
}
