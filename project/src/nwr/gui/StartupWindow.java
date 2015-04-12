/*
 *  "NorseWorld: Ragnarok", a roguelike game for PCs.
 *  Copyright (C) 2002-2008, 2014 by Serg V. Zhdanovskih (aka Alchemist).
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
package nwr.gui;

import nwr.core.StaticData;
import nwr.core.types.EventID;
import nwr.core.types.GameScreen;
import nwr.engine.BaseControl;
import nwr.engine.KeyEventArgs;
import nwr.engine.Keys;
import nwr.engine.WindowStyles;
import nwr.gui.controls.CtlCommon;
import nwr.main.GlobalVars;

/**
 *
 * @author Serg V. Zhdanovskih
 */
public final class StartupWindow extends NWWindow
{
    private void onBtnNew(Object sender)
    {
        this.hide();
        GlobalVars.nwrWin.doEvent(EventID.event_New, null, null, null);
    }

    private void onBtnLoad(Object sender)
    {
        this.hide();
        GlobalVars.nwrWin.doEvent(EventID.event_Load, null, null, null);
    }

    private void onBtnAbout(Object sender)
    {
        this.hide();
        GlobalVars.nwrWin.doEvent(EventID.event_About, null, null, null);
    }

    private void onBtnOptions(Object sender)
    {
        this.hide();
        GlobalVars.nwrWin.doEvent(EventID.event_Options, null, null, null);
    }

    private void onBtnExit(Object sender)
    {
        GlobalVars.nwrWin.doEvent(EventID.event_Quit, null, null, null);
    }

    @Override
    protected void doKeyDownEvent(KeyEventArgs eventArgs)
    {
        if (eventArgs.Key == Keys.GK_ESCAPE) {
            eventArgs.Key = Keys.GK_UNK;
        } else {
            if (eventArgs.Key == Keys.GK_S) {
                // FIXME: temp stub!
                GlobalVars.nwrWin.setScreen(GameScreen.gsDead);
                this.hide();
            } else {
                // FIXME: temp stub!
                GlobalVars.nwrWin.testSound(eventArgs.Key);
            }
        }
        super.doKeyDownEvent(eventArgs);
    }

    public StartupWindow(BaseControl owner)
    {
        super(owner);

        super.setFont(CtlCommon.smFont);
        super.setWidth(203);
        super.setHeight(230);
        super.WindowStyle = new WindowStyles(WindowStyles.wsScreenCenter, WindowStyles.wsModal, WindowStyles.wsKeyPreview);

        NWButton btn = new NWButton(this);
        btn.setLeft(20);
        btn.setTop(20);
        btn.setWidth(163);
        btn.setHeight(StaticData.btnHeight);
        btn.setImageFile("itf/MenuBtn.tga");
        btn.OnClick = this::onBtnNew;
        btn.OnLangChange = GlobalVars.nwrWin::LangChange;
        btn.setLangResID(1);

        btn = new NWButton(this);
        btn.setLeft(20);
        btn.setTop(60);
        btn.setWidth(163);
        btn.setHeight(StaticData.btnHeight);
        btn.setImageFile("itf/MenuBtn.tga");
        btn.OnClick = this::onBtnLoad;
        btn.OnLangChange = GlobalVars.nwrWin::LangChange;
        btn.setLangResID(2);

        btn = new NWButton(this);
        btn.setLeft(20);
        btn.setTop(100);
        btn.setWidth(163);
        btn.setHeight(StaticData.btnHeight);
        btn.setImageFile("itf/MenuBtn.tga");
        btn.OnClick = this::onBtnOptions;
        btn.OnLangChange = GlobalVars.nwrWin::LangChange;
        btn.setLangResID(5);

        btn = new NWButton(this);
        btn.setLeft(20);
        btn.setTop(140);
        btn.setWidth(163);
        btn.setHeight(StaticData.btnHeight);
        btn.setImageFile("itf/MenuBtn.tga");
        btn.OnClick = this::onBtnAbout;
        btn.OnLangChange = GlobalVars.nwrWin::LangChange;
        btn.setLangResID(4);

        btn = new NWButton(this);
        btn.setLeft(20);
        btn.setTop(180);
        btn.setWidth(163);
        btn.setHeight(StaticData.btnHeight);
        btn.setImageFile("itf/MenuBtn.tga");
        btn.OnClick = this::onBtnExit;
        btn.OnLangChange = GlobalVars.nwrWin::LangChange;
        btn.setLangResID(6);
    }
}