import { Pipe, PipeTransform } from '@angular/core';
import { Product } from './product';

@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {
  transform(products: Product [], search: string): Product [] {
    if (search === undefined) {
      return products;
    } else {
    return products.filter((value, index, array) => {
      return value.pname.toLowerCase().includes(search.toLowerCase());
    });
  }
}

}
