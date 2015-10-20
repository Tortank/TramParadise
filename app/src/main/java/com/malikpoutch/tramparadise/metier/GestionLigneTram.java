package com.malikpoutch.tramparadise.metier;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Malik on 10/08/2015.
 * Class permettant d'externaliser la gestion des lignes de tram..
 * <p/>
 * ATTENTION: TODO finir la methode pour savoir si oui ou non on est sur la fucking ligne de tram!
 */
public class GestionLigneTram {
    //Polyligne encoded ligne123 : fait avec l'utility google map polyline encoded
    private String ligne1Encoded = "eaf_Hve_IIq@H_CJ{BH}AHqBLiEVoE\\oE`@_FXsDf@sEj@aF`AgHf@qDZqBjAwLj@uEdAuJx@aH~@qHhAoJrAqK~AyJnA{DlBwDjBaDjCoE|AwCbAiBf@q@ZMf@?j@TjBlAbBhAnCfBz@j@`BfA~AlAdBxAfBxArBfBtC`Cb@ZZJVARIXYTs@`@oAp@aCd@yA`AcD`AaDh@kBv@gCt@oCp@_CdAmDz@qCVu@D]?_@E_@K]Sa@}@_A]]y@mAmAiB_BeC}AaCkAeBiAaBy@oA}A_CoAiBoAiBaAwAWk@Oo@G}@M_C[cGQgDMiCEiCBiCJ_CJoAb@iD\\gBx@kDt@eC\\sAXuA^}Bj@gEd@gDd@qD^wCTaB^uC^mC`@uCd@kDj@gE\\mCFoB?kAE}@Gy@QeBUaCSeBW{BSsBMkAOw@Oq@m@mBs@gC[mAc@gBw@gDm@mCo@}Co@aD[wAi@iCs@sD_AmEm@yBaAgDmAiEaAiDu@gC}@qBu@sAoAiBe@s@S_@[_Aq@wBq@yBy@qCOq@Qy@YwAYgBe@_Eg@uDc@cDa@}Ba@{Bo@cDk@iB}@{Bo@gBg@{As@aC}AgFkA{DYiAO_ASgBGeAQoDEq@o@oFc@wDa@qDc@kEk@eFw@cHoA{KMiA[wBa@mDSuBEm@AyADgBBmBKkBOuASsAYiBa@oCUoAYiAYiAq@kBc@iAc@gAq@_Bg@cAs@uAoA}BqBgC}B_Cy@o@s@m@mAu@wAw@oB{@eCaA}B}@gC}@eC}@eC}@}By@aC{@eC}@eC_AkAa@sBs@_Bm@_B]gCUgCOcB@cBFyALyAR{AZ{Bn@oBh@}Ad@}Bn@{Bn@kAZkBh@eBd@eAZcBd@_Cn@mBh@cCr@cBd@iBf@oA^_@N{@f@_@Ti@^i@f@_AbAs@x@m@t@a@f@k@hA_AlBk@bAgCbFqAfC}@xAcCrBk@Xs@Gq@i@mBwAiCoBiCgBeBiA}@o@uDgCwB}A{CkBeDsB_B}@g@Sc@Cc@P[TQb@IZE\\Cn@EnBElAG`BAhA?p@?fB?~@ArB?~BA~B?dB?hA";
    private String ligne2Encoded = "{|m_HpfvHfBuFj@{Bf@mC|@}GX}DZsEPwC@w@Ei@Mm@Qc@g@gAi@eAk@yAkAeD]}@g@}Ak@oBg@sB_@cBaAsFq@_EiA}GYoBUeB[sDIyA?i@Hk@Li@Ta@f@]\\Kl@@~A^`BX`ABr@@ZIZ]R_@N}@D{ADqCAsBEcBBcAJ{@Lq@Vw@z@qA`AkAjA{Ap@}@b@_A^eAZgAb@{A\\iA\\cAr@]`AUfEk@zB[pAKdBA~@Mh@G\\Ep@G^KTMPSLWPq@Ni@Pi@Vw@Ng@Pk@Fi@`@oDf@kF^_ENaBJcCL_ERcEZiE^iFVcDX{DJmALm@d@_Ap@aAdAaB`CqCdByBx@sAPMR?f@Nv@`@zAhAlAbA\\b@p@~@tB|ChBlCpBzCZp@j@fAfAbBr@bALPf@b@b@VfAXrAL|A?bADn@HpARpAFvBH~BJlAHl@@~CA|D?~@Br@FhE?nC?|BCpBA`AAtAAt@AbBAlA?x@?~@@fCCdABtBCv@@VEVOtAeCjBkD~@mBv@wAf@y@R_@VUT?R@NJTZ\\h@h@z@fBvCp@fAX\\RR^RVLZH^B^@ZEd@I^M`@UXSVWRUNWP]Zy@To@Pc@R]X]Z[h@WXITEZGTC`@E\\G`@En@Kh@Ef@?b@D\\Hl@Th@Xb@`@j@t@\\l@h@bA\\l@\\j@\\h@vAtBnC~Dj@r@^Z`@Tx@Nr@Dj@A`@CTEb@MvAa@nA_@p@Ul@Un@QrAa@fBi@dA{@v@q@^Yz@w@rAiAtAiAhA_Ab@g@b@k@`AmAlAwAnA{AvA_BdCsCpBaC`@e@`@a@j@m@TUd@[v@a@fB_AtCeB`@Y`A{@r@k@n@i@n@e@h@Y`Am@x@g@hC_B~A}@lAq@|A{@`B}@zBmA`B}@r@]TYh@}@^g@xBoAxBsAnBmArBmAhBcAt@g@h@Wf@Cd@NZJf@TZb@Vr@z@dD^`AV^\\^~CzB\\\\jAzBT`@n@r@pC|CjApANd@DX?^MdA_@bCWtAUfB";
    private String ligne3Encoded = "awj_H|wzHfA{Dp@{C^yBVgBJsAHkBD}BCuBKqBOaBWoCWyB[uCKqACi@B_@D]J]n@oB\\mAPu@Bg@E]GYQWsAkAy@w@y@{@Q[Qg@Qu@Qu@]s@_AyAo@cAg@_Aq@mA{@uA}@uAcA}A}@oAw@iAy@qA[k@Is@?o@Jo@Ri@\\i@|@oA`AsAt@_A`AmAdAoAfAwAvAoB`A}Av@cAt@eAhA}AlBgCdBcC|@mAh@m@f@]x@Mz@J~@RrATzARbANdBVnANb@BTC^YZk@f@sAf@iAr@mBj@{AZq@To@^}@f@oAXs@Xs@Tq@Z}@Z{@f@wAn@sA~@mAbAeBz@sAtAqBdAeBdAaBjAgBXg@d@sA^iAz@iCt@uBbA{ChAcD~@iCbAoCtCyIpAgDp@_B`A_BdBkCnAqAvAcB`AeA`AeAdCoCdCuCxA_ClBaCxBwCz@oAdAoB|@sArA}B~@oB`B{Cz@qA`AkAfAy@nA{@tAaAfBsAlAeAtBwAdBy@jBs@p@Yb@[X_@b@}@`@w@|@wAz@qAx@_Bn@gAjB}Cf@_AbA{Ap@gAf@q@TQj@Sr@Ux@Ut@WZWf@c@^Yn@i@vD_DnC{B`A{An@u@dCsClB}BdF_G|BiCh@g@zA}@jE_C~@m@dEgDtCkBtCgBvF}ChFoCdEaCfAcB~B{AjLaH~BwAd@Kh@NxAv@d@`Ar@pCb@lA\\v@ZX~DxCpAfCpD|DjBzBvB~Bt@`Cz@~C|@vBjA`B~DzCrAxAn@x@nAjAdDlAnDvAx@nAj@v@zAbAzAx@n@n@Zv@RrAt@bIp@nHDxBGxAKbBEbAb@lFd@lEd@~EvB~Ux@pIjA~Lh@xEdBxL~AdOzB`U`AbJDzAApAI`AYrAS|ADxBFvBVnApAxE`CdHl@zDj@xAjErGd@l@h@Tb@Vn@^b@xAv@|C";
    public boolean isOnLigneTram = false;


    public PolylineOptions dessinLigne1() {

        List<LatLng> lstLatLng = decodePoly(ligne1Encoded);

        PolylineOptions polylineOptions = new PolylineOptions();


        polylineOptions.color(-16711936).geodesic(true)
                .width(4)                                  //Epaisseur de la ligne
        ;

        //je parccour ma liste de geoPoint
        for (int i = 0; i < lstLatLng.size(); i++) {
            polylineOptions.add(lstLatLng.get(i));

        }
        return polylineOptions;

    }

    public PolylineOptions dessinLigne2() {

        List<LatLng> lstLatLng = decodePoly(ligne2Encoded);

        PolylineOptions polylineOptions = new PolylineOptions();


        polylineOptions.color(-65536).geodesic(true)
                .width(4)                                  //Epaisseur de la ligne
        ;

        //je parccour ma liste de geoPoint
        for (int i = 0; i < lstLatLng.size(); i++) {
            polylineOptions.add(lstLatLng.get(i));

        }
        return polylineOptions;

    }

    public PolylineOptions dessinLigne3() {

        List<LatLng> lstLatLng = decodePoly(ligne3Encoded);

        PolylineOptions polylineOptions = new PolylineOptions();


        polylineOptions.color(-16776961).geodesic(true)
                .width(4)                                  //Epaisseur de la ligne
        ;

        //je parccour ma liste de geoPoint
        for (int i = 0; i < lstLatLng.size(); i++) {
            polylineOptions.add(lstLatLng.get(i));

        }
        return polylineOptions;

    }


    //Decodeur de polyline encoded
    private List<LatLng> decodePoly(String encoded) {

        List<LatLng> poly = new ArrayList<LatLng>();
        int index = 0, len = encoded.length();
        int lat = 0, lng = 0;

        while (index < len) {
            int b, shift = 0, result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lat += dlat;

            shift = 0;
            result = 0;
            do {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lng += dlng;

            LatLng p = new LatLng((((double) lat / 1E5)),
                    (((double) lng / 1E5)));
            poly.add(p);
        }

        return poly;
    }


    //Methode permettant de savoir si on est sur la ligne de tram
    public void tchekIsOnLigneTram(String ligneTram) {
        List<LatLng> lstLatLng = decodePoly(ligneTram);
        List<LatLng> lstAllLatLng = getAllPointLigneTram(lstLatLng);

        for (int i= 0; i<lstAllLatLng.size() ; i++){

        }



    }

    public List<LatLng> getAllPointLigneTram(List<LatLng> lstLatLng) {

        Double pas = 0.01;
        int j = 1;
        List<LatLng> lstLatLngNew = new ArrayList<LatLng>();

        //On parcour la liste, on rajoute les GeoPoint manquant à la liste grace a l'eq de droite
        for (int i = 0; i < lstLatLng.size(); i++) {
            LatLng a = lstLatLng.get(i);
            LatLng b = lstLatLng.get(j);
            for (double latFin = a.latitude ; latFin < b.latitude; pas = pas +0.01) {
                double k = getConstK(a, b);
                double coeffDir = getCoeffDir(a, b);

                double x = a.latitude + pas;
                double y = coeffDir * x + k;
                LatLng nouvoLatLng = new LatLng(x, y);
                lstLatLngNew.add(nouvoLatLng);
                latFin =x;
            }
            j++;

        }

        return lstLatLngNew;
    }

    private double getCoeffDir(LatLng a, LatLng b) {

        double x1 = a.latitude;
        double y1 = a.longitude;
        double x2 = b.latitude;
        double y2 = b.longitude;

        double coeffDir = (y2 - y1) / (x2 - x1);

        return coeffDir;
    }

    private double getConstK(LatLng a, LatLng b) {

        double x1 = a.longitude;
        double y1 = a.latitude;

        double coeffDir = getCoeffDir(a, b);

        double k = y1 - coeffDir * x1;

        return k;

    }

    //Getters setters


    public boolean isOnLigneTram() {
        return isOnLigneTram;
    }

    public void setIsOnLigneTram(boolean isOnLigneTram) {
        this.isOnLigneTram = isOnLigneTram;
    }
}
