package com.sfb;

/**
 * Values that will not change throughout the execution of the program.
 * Later, some may be moved to a config file.
 * 
 * @author deastland
 *
 */
public class Constants {

	public static final double TRANS_ENERGY			= 0.2;							// The energy required to activate a single transporter box.
	public static final int    IMPULSES_PER_TURN	= 32;							// The number of impulses in every turn.
	public static final int    WEAPON_FIRE_DELAY	= (int)(IMPULSES_PER_TURN / 4);	// Weapons must wait 1/4 turn before firing again.
	
	// For each impluse, an array of the speeds that get a move.
	public static int[][] IMPULSE_CHART = {
/*Impulse*/		{},
/*1*/			{32},
/*2*/			{32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16},
/*3*/			{32,31,30,29,28,27,26,25,24,23,22,15,14,13,12,11},
/*4*/			{32,31,30,29,28,27,26,25,24,21,20,19,18,17,16,10,9,8},
/*5*/			{32,31,30,29,28,27,26,23,22,21,20,15,14,13,7},
/*6*/			{32,31,30,29,28,27,25,24,23,22,19,18,17,16,12,11,6},
/*7*/			{32,31,30,29,28,26,25,24,23,21,20,19,15,14,10,5},
/*8*/			{32,31,30,29,28,27,26,25,24,22,21,20,18,17,16,13,12,9,8,4},
/*9*/			{32,31,30,29,27,26,25,23,22,19,18,15,11},
/*10*/			{32,31,30,29,28,27,26,24,23,21,20,17,16,14,13,10,7},
/*11*/			{32,31,30,28,27,25,24,22,21,19,18,15,12,9,6,3},
/*12*/			{32,31,30,29,28,27,26,25,24,23,22,20,19,17,16,14,11,8},
/*13*/			{32,31,30,29,28,26,25,23,21,20,18,15,13,10,5},
/*14*/			{32,31,30,29,28,27,26,24,23,22,21,19,17,16,14,12,7},
/*15*/			{32,31,30,29,28,27,26,25,24,22,20,18,15,13,11,9},
/*16*/			{32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,14,12,10,8,6,4,2},
/*17*/			{32,31,29,27,25,23,21,19,17},
/*18*/			{32,31,30,29,28,27,26,25,24,22,20,18,16,15,13,11,9},
/*19*/			{32,31,30,29,28,27,26,24,23,22,21,19,17,14,12,7},
/*20*/			{32,31,30,29,28,26,25,24,23,21,20,18,16,15,13,10,8,5},
/*21*/			{32,31,30,29,28,27,26,25,23,22,20,19,17,14,11},
/*22*/			{32,31,30,28,27,25,24,22,21,19,18,16,15,12,9,6,3},
/*23*/			{32,31,30,29,28,27,26,24,23,21,20,17,14,13,10,7},
/*24*/			{32,31,30,29,28,27,26,25,24,23,22,20,19,18,16,15,12,11,8,4},
/*25*/			{32,31,30,29,27,26,25,22,21,18,17,13,9},
/*26*/			{32,31,30,29,28,26,25,24,23,21,20,19,16,15,14,10,5},
/*27*/			{32,31,30,29,28,27,25,24,23,22,19,18,17,12,11,6},
/*28*/			{32,31,30,29,28,27,26,24,23,22,21,20,16,15,14,13,8,7},
/*29*/			{32,31,30,29,28,27,26,25,21,20,19,18,17,10,9},
/*30*/			{32,31,30,29,28,27,26,25,24,23,22,16,15,14,13,12,11},
/*31*/			{32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17},
/*32*/			{32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1},
	};
}
