/*
 * Copyright 2011-2014 Will Tipton, Richard Hennig, Ben Revard, Stewart Wenner

This file is part of the Genetic Algorithm for Structure and Phase Prediction (GASP).

    GASP is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    GASP is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with GASP.  If not, see <http://www.gnu.org/licenses/>.
    
    
    */

package utility;

import java.io.Serializable;

public class Pair<T, S> implements Serializable
{
  public static final long serialVersionUID = 1l;
  
  public Pair(T f, S s)
  { 
    first = f;
    second = s;   
  }

  public T getFirst()
  {
    return first;
  }

  public S getSecond() 
  {
    return second;
  }

  public String toString()
  { 
    return "(" + first.toString() + ", " + second.toString() + ")"; 
  }

  private T first;
  private S second;
}
