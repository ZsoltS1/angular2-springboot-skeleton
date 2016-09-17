import {Routes, RouterModule} from "@angular/router";

const appRoutes:Routes = [
    {
        path: '',
        canActivate: [],
        children: []
    }
];

export const appRoutingProviders:any[] = [];

export const routing = RouterModule.forRoot(appRoutes);
