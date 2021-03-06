/*
 *  "NorseWorld: Ragnarok", a roguelike game for PCs.
 *  Copyright (C) 2002-2008, 2014 by Serg V. Zhdanovskih.
 *
 *  This file is part of "NorseWorld: Ragnarok".
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

namespace NWR.Game.Types
{
    /// <summary>
    /// 
    /// </summary>
    public static class ItemAttribute
    {
        public const int ia_Defense = 1;
        public const int ia_DamageMin = 2;
        public const int ia_DamageMax = 3;
        public const int ia_Mdf_Str = 4;
        public const int ia_Mdf_Luck = 5;
        public const int ia_Mdf_Speed = 6;
        public const int ia_Mdf_Attacks = 7;
        public const int ia_Mdf_ToHit = 8;
        public const int ia_Mdf_Health = 9;
        public const int ia_Mdf_Mana = 10;

        public const int ia_First = 1;
        public const int ia_Last = 10;
    }
}
