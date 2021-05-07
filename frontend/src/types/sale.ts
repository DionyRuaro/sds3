import { Seller } from "./seller"

export type Sale = {
    id: number;
    visited: number;
    deals: number;
    amount: number;
    date: string;
    seller: Seller;
}

export type SalePage = {
    totalPages: number;
    content?: Sale[];
    last: boolean;
    totalElements: number;
    size?: number;
    number: number;
    numberOfElements?: number;
    first: boolean;
    empty?: boolean;

}

export type SaleSum = {
    sellerName: string;
    sum: number;
}

export type SalesSuccess = {
    sellerName: string;
    visited: number;
    deals: number;
}